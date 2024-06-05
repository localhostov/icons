package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PodiumStar: ImageVector
    get() {
        if (_podiumStar != null) {
            return _podiumStar!!
        }
        _podiumStar = Builder(name = "PodiumStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.761f)
                curveToRelative(0.456f, 0.604f, 1.173f, 1.0f, 1.989f, 1.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.815f, 0.0f, -1.532f, 0.396f, -1.989f, 1.0f)
                horizontalLineToRelative(-0.761f)
                curveTo(4.468f, 1.0f, 2.0f, 3.468f, 2.0f, 6.5f)
                verticalLineToRelative(2.5f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.066f, 12.0f)
                lineToRelative(2.182f, 12.0f)
                lineTo(20.31f, 24.0f)
                lineToRelative(1.636f, -12.0f)
                horizontalLineToRelative(2.054f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.69f, 21.0f)
                lineTo(6.752f, 21.0f)
                lineToRelative(-1.637f, -9.0f)
                horizontalLineToRelative(13.802f)
                lineToRelative(-1.227f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.512f, 19.167f)
                lineToRelative(0.781f, 0.567f)
                lineToRelative(1.701f, -1.237f)
                lineToRelative(1.713f, 1.236f)
                lineToRelative(0.781f, -0.567f)
                lineToRelative(-0.652f, -2.007f)
                lineToRelative(1.707f, -1.241f)
                lineToRelative(-0.3f, -0.918f)
                lineToRelative(-2.11f, 0.0f)
                lineToRelative(-0.653f, -2.006f)
                lineToRelative(-0.96f, 0.006f)
                lineToRelative(-0.653f, 2.001f)
                lineToRelative(-2.11f, 0.0f)
                lineToRelative(-0.3f, 0.918f)
                lineToRelative(1.707f, 1.241f)
                lineToRelative(-0.652f, 2.007f)
                close()
            }
        }
        .build()
        return _podiumStar!!
    }

private var _podiumStar: ImageVector? = null
