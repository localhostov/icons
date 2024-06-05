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

public val Icons.Filled.Taco: ImageVector
    get() {
        if (_taco != null) {
            return _taco!!
        }
        _taco = Builder(name = "Taco", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 4.0f, 16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, true, 0.9f, -3.688f)
                arcToRelative(17.513f, 17.513f, 0.0f, false, true, -0.712f, -2.533f)
                arcTo(9.963f, 9.963f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(21.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(24.0f, 16.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 14.0f, 6.0f)
                close()
                moveTo(16.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 20.0f)
                close()
                moveTo(18.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 17.0f)
                close()
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(4.286f, 8.982f)
                arcTo(8.6f, 8.6f, 0.0f, false, true, 4.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.311f, 3.06f)
                arcToRelative(3.543f, 3.543f, 0.0f, false, true, 3.957f, -1.972f)
                arcToRelative(3.974f, 3.974f, 0.0f, false, true, 5.464f, 0.0f)
                arcTo(3.421f, 3.421f, 0.0f, false, true, 17.5f, 1.0f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, true, 3.189f, 2.06f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 24.0f, 7.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -0.286f, 1.982f)
                arcToRelative(11.961f, 11.961f, 0.0f, false, false, -19.428f, 0.0f)
                close()
            }
        }
        .build()
        return _taco!!
    }

private var _taco: ImageVector? = null
