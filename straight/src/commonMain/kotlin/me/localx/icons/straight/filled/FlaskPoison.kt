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

public val Icons.Filled.FlaskPoison: ImageVector
    get() {
        if (_flaskPoison != null) {
            return _flaskPoison!!
        }
        _flaskPoison = Builder(name = "FlaskPoison", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 16.714f)
                curveToRelative(0.0f, 2.506f, -0.841f, 4.894f, -2.431f, 6.906f)
                lineToRelative(-0.3f, 0.38f)
                lineTo(2.73f, 24.0f)
                lineToRelative(-0.3f, -0.38f)
                curveToRelative(-1.59f, -2.012f, -2.431f, -4.399f, -2.431f, -6.906f)
                curveToRelative(0.0f, -4.535f, 2.725f, -8.556f, 7.0f, -10.423f)
                lineTo(6.999f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.999f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.333f)
                curveToRelative(4.215f, 1.89f, 7.0f, 5.98f, 7.0f, 10.382f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _flaskPoison!!
    }

private var _flaskPoison: ImageVector? = null
