package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.FlaskPotion: ImageVector
    get() {
        if (_flaskPotion != null) {
            return _flaskPotion!!
        }
        _flaskPotion = Builder(name = "FlaskPotion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 6.291f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.333f)
                curveToRelative(2.786f, 1.249f, 4.94f, 3.462f, 6.086f, 6.089f)
                curveToRelative(-0.96f, 0.657f, -3.986f, 2.579f, -6.586f, 2.579f)
                curveToRelative(-1.652f, 0.0f, -2.865f, -0.455f, -4.148f, -0.937f)
                curveToRelative(-1.395f, -0.523f, -2.837f, -1.063f, -4.852f, -1.063f)
                curveToRelative(-2.962f, 0.0f, -6.127f, 1.87f, -7.455f, 2.752f)
                curveToRelative(0.356f, -4.135f, 2.985f, -7.727f, 6.955f, -9.461f)
                close()
                moveTo(16.5f, 17.0f)
                curveToRelative(-2.015f, 0.0f, -3.457f, -0.541f, -4.852f, -1.063f)
                curveToRelative(-1.283f, -0.482f, -2.496f, -0.937f, -4.148f, -0.937f)
                curveToRelative(-3.119f, 0.0f, -6.863f, 2.772f, -6.9f, 2.8f)
                lineToRelative(-0.499f, 0.327f)
                curveToRelative(0.256f, 1.986f, 1.043f, 3.864f, 2.331f, 5.493f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.539f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.012f, 2.431f, -4.399f, 2.431f, -6.906f)
                curveToRelative(0.0f, -0.788f, -0.093f, -1.566f, -0.264f, -2.323f)
                curveToRelative(-1.436f, 0.927f, -4.429f, 2.609f, -7.236f, 2.609f)
                close()
            }
        }
        .build()
        return _flaskPotion!!
    }

private var _flaskPotion: ImageVector? = null
