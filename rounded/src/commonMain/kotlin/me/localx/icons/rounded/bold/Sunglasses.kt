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

public val Icons.Bold.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.89f, 13.667f)
                lineToRelative(-1.386f, -9.004f)
                curveToRelative(-0.415f, -2.702f, -2.701f, -4.664f, -5.436f, -4.664f)
                horizontalLineToRelative(-1.068f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.068f)
                curveToRelative(1.243f, 0.0f, 2.282f, 0.891f, 2.471f, 2.12f)
                lineToRelative(1.213f, 7.88f)
                horizontalLineToRelative(-2.252f)
                curveToRelative(-1.704f, 0.0f, -3.23f, 0.779f, -4.239f, 2.0f)
                horizontalLineToRelative(-4.521f)
                curveToRelative(-1.01f, -1.221f, -2.535f, -2.0f, -4.239f, -2.0f)
                horizontalLineToRelative(-2.252f)
                lineToRelative(1.213f, -7.88f)
                curveToRelative(0.188f, -1.229f, 1.228f, -2.12f, 2.471f, -2.12f)
                horizontalLineToRelative(1.068f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.068f)
                curveTo(4.197f, 0.0f, 1.911f, 1.961f, 1.496f, 4.664f)
                lineTo(0.11f, 13.669f)
                curveToRelative(-0.073f, 0.477f, -0.11f, 0.963f, -0.11f, 1.443f)
                verticalLineToRelative(3.388f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.169f, -0.008f, -0.335f, -0.023f, -0.5f)
                horizontalLineToRelative(2.046f)
                curveToRelative(-0.015f, 0.165f, -0.023f, 0.331f, -0.023f, 0.5f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-3.388f)
                curveToRelative(0.0f, -0.48f, -0.037f, -0.966f, -0.11f, -1.444f)
                close()
                moveTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
