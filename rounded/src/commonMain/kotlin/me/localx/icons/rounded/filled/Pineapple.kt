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

public val Icons.Filled.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.212f, 7.0f)
                arcToRelative(6.055f, 6.055f, 0.0f, false, true, 3.079f, 3.327f)
                lineToRelative(-3.639f, 3.639f)
                lineToRelative(-3.2f, -3.2f)
                close()
                moveTo(15.053f, 6.331f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(0.0f, 0.011f)
                close()
                moveTo(8.776f, 15.439f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(3.259f, -3.259f)
                lineToRelative(-3.2f, -3.2f)
                close()
                moveTo(10.621f, 10.766f)
                lineTo(6.835f, 6.98f)
                arcTo(6.064f, 6.064f, 0.0f, false, false, 3.7f, 10.361f)
                lineToRelative(3.664f, 3.664f)
                close()
                moveTo(9.621f, 23.83f)
                arcToRelative(17.034f, 17.034f, 0.0f, false, false, 4.725f, 0.005f)
                lineTo(11.979f, 21.47f)
                close()
                moveTo(3.141f, 12.63f)
                arcToRelative(18.7f, 18.7f, 0.0f, false, false, 0.124f, 5.495f)
                lineToRelative(2.685f, -2.685f)
                close()
                moveTo(7.364f, 16.854f)
                lineTo(3.971f, 20.245f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, false, 3.391f, 3.013f)
                lineToRelative(3.2f, -3.2f)
                close()
                moveTo(13.395f, 20.054f)
                lineTo(16.608f, 23.267f)
                arcTo(6.112f, 6.112f, 0.0f, false, false, 20.052f, 20.2f)
                lineToRelative(-3.4f, -3.4f)
                close()
                moveTo(20.859f, 12.589f)
                lineTo(18.068f, 15.381f)
                lineTo(20.749f, 18.062f)
                arcTo(18.792f, 18.792f, 0.0f, false, false, 20.857f, 12.591f)
                close()
                moveTo(17.9f, 1.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.342f, -0.448f)
                arcTo(6.461f, 6.461f, 0.0f, false, false, 13.0f, 6.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 6.0f)
                arcTo(6.461f, 6.461f, 0.0f, false, false, 7.447f, 1.105f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.553f, 2.9f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, true, 2.4f, 3.438f)
                lineTo(8.947f, 6.338f)
                lineTo(12.0f, 9.387f)
                lineToRelative(3.043f, -3.043f)
                arcToRelative(4.474f, 4.474f, 0.0f, false, true, 2.4f, -3.449f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.9f, 1.553f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
