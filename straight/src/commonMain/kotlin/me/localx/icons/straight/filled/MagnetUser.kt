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

public val Icons.Filled.MagnetUser: ImageVector
    get() {
        if (_magnetUser != null) {
            return _magnetUser!!
        }
        _magnetUser = Builder(name = "MagnetUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(14.691f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.143f)
                curveToRelative(0.733f, 0.832f, 1.806f, 1.357f, 3.0f, 1.357f)
                reflectiveCurveToRelative(2.267f, -0.525f, 3.0f, -1.357f)
                verticalLineToRelative(-0.143f)
                close()
                moveTo(10.82f, 16.235f)
                lineToRelative(-2.135f, 2.133f)
                curveToRelative(-0.843f, 0.842f, -2.213f, 0.842f, -3.056f, 0.0f)
                curveToRelative(-0.842f, -0.843f, -0.842f, -2.213f, 0.0f, -3.056f)
                lineToRelative(2.135f, -2.133f)
                lineToRelative(-3.505f, -3.505f)
                lineToRelative(-2.178f, 2.177f)
                curveToRelative(-2.775f, 2.774f, -2.775f, 7.29f, 0.0f, 10.064f)
                curveToRelative(1.344f, 1.345f, 3.132f, 2.085f, 5.033f, 2.085f)
                reflectiveCurveToRelative(3.688f, -0.74f, 5.033f, -2.085f)
                lineToRelative(2.178f, -2.177f)
                lineToRelative(-3.504f, -3.504f)
                close()
                moveTo(15.739f, 18.326f)
                lineToRelative(1.761f, -1.76f)
                lineToRelative(-3.504f, -3.504f)
                lineToRelative(-1.762f, 1.76f)
                lineToRelative(3.504f, 3.504f)
                close()
                moveTo(9.179f, 11.766f)
                lineToRelative(1.761f, -1.76f)
                lineToRelative(-3.505f, -3.504f)
                lineToRelative(-1.761f, 1.76f)
                lineToRelative(3.504f, 3.504f)
                close()
            }
        }
        .build()
        return _magnetUser!!
    }

private var _magnetUser: ImageVector? = null
