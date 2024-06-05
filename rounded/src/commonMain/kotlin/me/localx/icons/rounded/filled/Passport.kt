package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.023f, 4.171f)
                curveToRelative(0.561f, 0.0f, 0.87f, 2.265f, 0.977f, 4.829f)
                horizontalLineToRelative(-1.954f)
                curveToRelative(0.107f, -2.564f, 0.416f, -4.829f, 0.977f, -4.829f)
                close()
                moveTo(13.0f, 11.0f)
                curveToRelative(-0.107f, 2.564f, -0.435f, 4.829f, -0.977f, 4.829f)
                reflectiveCurveToRelative(-0.87f, -2.265f, -0.977f, -4.829f)
                horizontalLineToRelative(1.954f)
                close()
                moveTo(8.562f, 5.118f)
                curveToRelative(0.41f, -0.291f, 0.978f, 0.055f, 0.877f, 0.548f)
                curveToRelative(-0.251f, 1.215f, -0.351f, 2.473f, -0.39f, 3.334f)
                horizontalLineToRelative(-2.935f)
                curveToRelative(0.27f, -1.6f, 1.177f, -2.98f, 2.448f, -3.882f)
                close()
                moveTo(6.114f, 11.0f)
                horizontalLineToRelative(2.935f)
                curveToRelative(0.039f, 0.861f, 0.14f, 2.119f, 0.39f, 3.334f)
                curveToRelative(0.102f, 0.493f, -0.466f, 0.839f, -0.877f, 0.548f)
                curveToRelative(-1.271f, -0.902f, -2.178f, -2.282f, -2.448f, -3.882f)
                close()
                moveTo(16.001f, 20.0f)
                lineTo(8.0f, 20.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(15.485f, 14.882f)
                curveToRelative(-0.41f, 0.291f, -0.978f, -0.055f, -0.877f, -0.548f)
                curveToRelative(0.251f, -1.215f, 0.351f, -2.473f, 0.39f, -3.334f)
                horizontalLineToRelative(2.935f)
                curveToRelative(-0.27f, 1.6f, -1.177f, 2.98f, -2.448f, 3.882f)
                close()
                moveTo(14.998f, 9.0f)
                curveToRelative(-0.039f, -0.861f, -0.14f, -2.119f, -0.39f, -3.334f)
                curveToRelative(-0.102f, -0.493f, 0.466f, -0.839f, 0.877f, -0.548f)
                curveToRelative(1.271f, 0.901f, 2.178f, 2.282f, 2.448f, 3.882f)
                horizontalLineToRelative(-2.935f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
