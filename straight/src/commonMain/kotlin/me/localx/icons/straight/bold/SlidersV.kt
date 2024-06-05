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

public val Icons.Bold.SlidersV: ImageVector
    get() {
        if (_slidersV != null) {
            return _slidersV!!
        }
        _slidersV = Builder(name = "SlidersV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 7.5f)
                curveToRelative(0.0f, 1.396f, -0.818f, 2.601f, -2.0f, 3.163f)
                verticalLineToRelative(13.337f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-13.337f)
                curveToRelative(-1.182f, -0.562f, -2.0f, -1.767f, -2.0f, -3.163f)
                reflectiveCurveToRelative(0.818f, -2.601f, 2.0f, -3.163f)
                lineTo(2.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.337f)
                curveToRelative(1.182f, 0.562f, 2.0f, 1.767f, 2.0f, 3.163f)
                close()
                moveTo(13.5f, 13.337f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(13.337f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                reflectiveCurveToRelative(0.818f, 2.601f, 2.0f, 3.163f)
                verticalLineToRelative(4.337f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.337f)
                curveToRelative(1.182f, -0.562f, 2.0f, -1.767f, 2.0f, -3.163f)
                reflectiveCurveToRelative(-0.818f, -2.601f, -2.0f, -3.163f)
                close()
                moveTo(23.5f, 7.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                lineTo(21.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.337f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                reflectiveCurveToRelative(0.818f, 2.601f, 2.0f, 3.163f)
                verticalLineToRelative(13.337f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-13.337f)
                curveToRelative(1.182f, -0.562f, 2.0f, -1.767f, 2.0f, -3.163f)
                close()
            }
        }
        .build()
        return _slidersV!!
    }

private var _slidersV: ImageVector? = null
