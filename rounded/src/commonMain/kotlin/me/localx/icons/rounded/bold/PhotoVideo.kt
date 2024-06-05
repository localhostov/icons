package me.localx.icons.rounded.bold

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

public val Icons.Bold.PhotoVideo: ImageVector
    get() {
        if (_photoVideo != null) {
            return _photoVideo!!
        }
        _photoVideo = Builder(name = "PhotoVideo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 16.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(-0.036f)
                curveToRelative(0.0f, -0.989f, 0.736f, -1.84f, 1.712f, -1.979f)
                curveToRelative(0.82f, -0.117f, 1.39f, -0.877f, 1.272f, -1.697f)
                curveToRelative(-0.117f, -0.82f, -0.885f, -1.395f, -1.697f, -1.272f)
                curveTo(1.843f, 6.365f, 0.0f, 8.493f, 0.0f, 10.964f)
                verticalLineToRelative(8.036f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(15.0f, 24.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(11.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.196f)
                lineToRelative(-2.115f, 2.115f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-0.47f, -0.476f)
                curveToRelative(-0.366f, -0.366f, -0.95f, -0.392f, -1.347f, -0.061f)
                lineToRelative(-3.698f, 3.176f)
                curveToRelative(-0.577f, -0.458f, -0.954f, -1.157f, -0.954f, -1.949f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _photoVideo!!
    }

private var _photoVideo: ImageVector? = null
