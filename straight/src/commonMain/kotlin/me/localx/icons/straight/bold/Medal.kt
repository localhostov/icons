package me.localx.icons.straight.bold

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

public val Icons.Bold.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.126f, 14.0f)
                horizontalLineToRelative(2.911f)
                verticalLineToRelative(0.589f)
                lineToRelative(-2.221f, 1.285f)
                lineToRelative(0.892f, 2.711f)
                lineToRelative(-0.505f, 0.352f)
                lineToRelative(-2.194f, -1.697f)
                lineToRelative(-2.203f, 1.704f)
                lineToRelative(-0.485f, -0.365f)
                lineToRelative(0.877f, -2.742f)
                lineToRelative(-2.236f, -1.243f)
                verticalLineToRelative(-0.593f)
                horizontalLineToRelative(2.927f)
                lineToRelative(0.792f, -3.0f)
                horizontalLineToRelative(0.653f)
                lineToRelative(0.791f, 3.0f)
                close()
                moveTo(19.246f, 9.669f)
                curveToRelative(1.101f, 1.493f, 1.753f, 3.337f, 1.753f, 5.331f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.962f, 3.0f, 15.0f)
                curveToRelative(0.0f, -1.996f, 0.654f, -3.843f, 1.758f, -5.337f)
                lineTo(-0.009f, 0.0f)
                horizontalLineToRelative(9.281f)
                lineToRelative(2.734f, 5.542f)
                lineTo(14.749f, 0.0f)
                horizontalLineToRelative(9.282f)
                lineToRelative(-4.784f, 9.669f)
                close()
                moveTo(16.61f, 3.0f)
                lineToRelative(-1.72f, 3.476f)
                curveToRelative(0.742f, 0.252f, 1.44f, 0.599f, 2.082f, 1.026f)
                lineToRelative(2.227f, -4.502f)
                horizontalLineToRelative(-2.589f)
                close()
                moveTo(4.816f, 3.0f)
                lineToRelative(2.219f, 4.497f)
                curveToRelative(0.642f, -0.427f, 1.342f, -0.773f, 2.085f, -1.025f)
                lineToRelative(-1.713f, -3.472f)
                horizontalLineToRelative(-2.591f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
