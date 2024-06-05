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

public val Icons.Outline.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(16.9f, 5.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 12.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.061f, 3.877f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 6.9f, 0.123f)
                horizontalLineToRelative(4.082f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.061f, -0.623f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 15.0f)
                lineTo(24.0f, 10.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 5.0f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 10.0f)
                close()
                moveTo(2.0f, 15.0f)
                lineTo(2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(15.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.0f)
                close()
                moveTo(8.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.418f, 1.418f, 0.0f, false, true, 0.093f, -0.5f)
                lineTo(7.907f, 19.0f)
                arcTo(1.418f, 1.418f, 0.0f, false, true, 8.0f, 19.5f)
                close()
                moveTo(17.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 19.5f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, -0.5f)
                horizontalLineToRelative(2.814f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, 0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 21.0f)
                close()
                moveTo(20.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
