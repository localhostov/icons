package me.localx.icons.straight.outline

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

public val Icons.Outline.FlaskPoison: ImageVector
    get() {
        if (_flaskPoison != null) {
            return _flaskPoison!!
        }
        _flaskPoison = Builder(name = "FlaskPoison", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 6.333f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.291f)
                curveTo(2.725f, 8.158f, 0.0f, 12.179f, 0.0f, 16.714f)
                curveToRelative(0.0f, 2.506f, 0.841f, 4.894f, 2.431f, 6.906f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.539f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.012f, 2.431f, -4.399f, 2.431f, -6.906f)
                curveToRelative(0.0f, -4.401f, -2.785f, -8.492f, -7.0f, -10.382f)
                close()
                moveTo(20.286f, 22.0f)
                lineTo(3.714f, 22.0f)
                curveToRelative(-1.123f, -1.571f, -1.714f, -3.389f, -1.714f, -5.286f)
                curveToRelative(0.0f, -3.917f, 2.492f, -7.376f, 6.349f, -8.812f)
                lineToRelative(0.651f, -0.242f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.688f)
                lineToRelative(0.643f, 0.246f)
                curveToRelative(3.803f, 1.454f, 6.357f, 4.982f, 6.357f, 8.78f)
                curveToRelative(0.0f, 1.896f, -0.591f, 3.714f, -1.714f, 5.286f)
                close()
            }
        }
        .build()
        return _flaskPoison!!
    }

private var _flaskPoison: ImageVector? = null
