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

public val Icons.Filled.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 14.0f)
                lineTo(1.5f, 14.0f)
                arcToRelative(7.116f, 7.116f, 0.0f, false, true, 0.424f, -0.88f)
                lineTo(3.98f, 9.52f)
                arcTo(5.011f, 5.011f, 0.0f, false, true, 8.321f, 7.0f)
                horizontalLineToRelative(7.358f)
                arcTo(5.011f, 5.011f, 0.0f, false, true, 20.02f, 9.52f)
                lineToRelative(2.057f, 3.6f)
                arcTo(7.116f, 7.116f, 0.0f, false, true, 22.5f, 14.0f)
                close()
                moveTo(22.973f, 16.0f)
                lineTo(19.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(17.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(5.0f, 16.0f)
                lineTo(1.026f, 16.0f)
                quadTo(1.0f, 16.3f, 1.0f, 16.594f)
                lineTo(1.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                lineTo(3.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 18.0f)
                lineTo(23.0f, 16.594f)
                quadTo(23.0f, 16.3f, 22.974f, 16.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, 1.414f, -3.414f)
                lineToRelative(-0.8f, -0.9f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, false, -1.222f, 0.0f)
                lineToRelative(-0.8f, 0.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(17.985f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 19.4f, 1.586f)
                lineToRelative(-0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -1.223f, 0.0f)
                lineToRelative(-0.8f, 0.9f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 17.985f, 5.0f)
                close()
                moveTo(5.985f, 5.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 7.4f, 1.586f)
                lineToRelative(-0.8f, -0.9f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -1.223f, 0.0f)
                lineToRelative(-0.8f, 0.9f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 5.985f, 5.0f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
