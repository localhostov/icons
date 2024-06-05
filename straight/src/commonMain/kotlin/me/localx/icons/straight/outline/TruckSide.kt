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
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(0.0f, 19.0f)
                lineTo(2.041f, 19.0f)
                arcTo(3.465f, 3.465f, 0.0f, false, false, 2.0f, 19.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                horizontalLineToRelative(6.082f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 10.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 5.0f)
                close()
                moveTo(19.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(7.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.418f, 1.418f, 0.0f, false, true, 0.093f, -0.5f)
                lineTo(6.907f, 19.0f)
                arcTo(1.418f, 1.418f, 0.0f, false, true, 7.0f, 19.5f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(20.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, -0.5f)
                horizontalLineToRelative(2.814f)
                arcTo(1.41f, 1.41f, 0.0f, false, true, 20.0f, 19.5f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
