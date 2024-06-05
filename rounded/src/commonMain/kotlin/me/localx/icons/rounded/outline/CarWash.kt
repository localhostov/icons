package me.localx.icons.rounded.outline

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

public val Icons.Outline.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.077f, 13.12f)
                lineTo(20.02f, 9.52f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 15.679f, 7.0f)
                lineTo(8.321f, 7.0f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 3.98f, 9.52f)
                lineToRelative(-2.057f, 3.6f)
                arcTo(7.007f, 7.007f, 0.0f, false, false, 1.0f, 16.594f)
                lineTo(1.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                lineTo(3.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 18.0f)
                lineTo(23.0f, 16.594f)
                arcTo(7.007f, 7.007f, 0.0f, false, false, 22.077f, 13.12f)
                close()
                moveTo(5.717f, 10.512f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 8.321f, 9.0f)
                horizontalLineToRelative(7.358f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, 2.6f, 1.512f)
                lineTo(20.277f, 14.0f)
                lineTo(3.723f, 14.0f)
                close()
                moveTo(21.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(3.0f, 16.594f)
                arcTo(5.119f, 5.119f, 0.0f, false, true, 3.036f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(1.964f)
                arcToRelative(5.119f, 5.119f, 0.0f, false, true, 0.036f, 0.594f)
                close()
                moveTo(10.586f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(0.8f, -0.9f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, 1.222f, 0.0f)
                lineToRelative(0.8f, 0.9f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(1.99f, 1.99f, 0.0f, false, true, 10.586f, 4.414f)
                close()
                moveTo(16.571f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, 1.223f, 0.0f)
                lineToRelative(0.8f, 0.9f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 17.985f, 5.0f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 16.571f, 4.414f)
                close()
                moveTo(4.571f, 4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(0.8f, -0.9f)
                arcTo(0.818f, 0.818f, 0.0f, false, true, 6.6f, 0.686f)
                lineToRelative(0.8f, 0.9f)
                arcTo(2.013f, 2.013f, 0.0f, false, true, 5.985f, 5.0f)
                arcTo(1.992f, 1.992f, 0.0f, false, true, 4.571f, 4.414f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
