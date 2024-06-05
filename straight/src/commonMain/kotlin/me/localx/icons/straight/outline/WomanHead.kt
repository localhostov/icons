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

public val Icons.Outline.WomanHead: ImageVector
    get() {
        if (_womanHead != null) {
            return _womanHead!!
        }
        _womanHead = Builder(name = "WomanHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.912f, 20.027f)
                lineToRelative(-1.057f, -5.96f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, -1.0f, -5.793f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.226f, 7.9f)
                lineTo(1.5f, 12.0f)
                horizontalLineTo(3.0f)
                arcToRelative(12.12f, 12.12f, 0.0f, false, false, 5.184f, -1.2f)
                arcTo(1.477f, 1.477f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.634f, -1.487f)
                arcToRelative(16.772f, 16.772f, 0.0f, false, false, 5.287f, -5.249f)
                arcTo(5.949f, 5.949f, 0.0f, false, false, 13.028f, 4.1f)
                curveTo(11.49f, 6.379f, 8.217f, 9.563f, 3.893f, 9.959f)
                lineTo(4.188f, 8.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.766f, 0.859f)
                lineToRelative(0.078f, 0.746f)
                lineToRelative(0.738f, 0.133f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                curveToRelative(-0.086f, 0.0f, -1.087f, -0.175f, -1.087f, -0.175f)
                lineToRelative(-0.282f, 0.8f)
                curveTo(18.214f, 16.222f, 15.13f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-2.861f, 0.0f, -5.678f, -2.323f, -6.842f, -4.7f)
                lineToRelative(-0.51f, 2.879f)
                arcTo(11.083f, 11.083f, 0.0f, false, false, 8.111f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.238f)
                arcTo(1.242f, 1.242f, 0.0f, false, true, 2.03f, 20.488f)
                lineToRelative(1.15f, -6.5f)
                curveToRelative(-0.06f, 0.0f, -0.119f, 0.011f, -0.18f, 0.011f)
                horizontalLineTo(1.147f)
                lineTo(0.065f, 20.115f)
                arcTo(3.238f, 3.238f, 0.0f, false, false, 3.237f, 24.0f)
                lineTo(10.0f, 24.0f)
                verticalLineTo(20.734f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(6.762f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, 2.56f, -1.256f)
                arcTo(3.172f, 3.172f, 0.0f, false, false, 23.912f, 20.027f)
                close()
                moveTo(21.74f, 21.52f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, true, -0.978f, 0.48f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.954f)
                arcToRelative(11.037f, 11.037f, 0.0f, false, false, 4.732f, -4.962f)
                curveToRelative(0.085f, -0.005f, 0.165f, -0.029f, 0.248f, -0.04f)
                lineToRelative(0.979f, 5.5f)
                arcTo(1.227f, 1.227f, 0.0f, false, true, 21.74f, 21.52f)
                close()
                moveTo(14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 13.0f)
                close()
            }
        }
        .build()
        return _womanHead!!
    }

private var _womanHead: ImageVector? = null
