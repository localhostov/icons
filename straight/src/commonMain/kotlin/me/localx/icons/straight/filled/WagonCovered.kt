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

public val Icons.Filled.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 21.0f)
                close()
                moveTo(22.024f, 12.0f)
                lineTo(1.98f, 12.0f)
                lineTo(0.068f, 3.948f)
                arcToRelative(2.711f, 2.711f, 0.0f, false, true, 0.7f, -2.483f)
                arcTo(2.682f, 2.682f, 0.0f, false, true, 3.194f, 0.683f)
                lineToRelative(0.413f, 0.082f)
                arcTo(12.043f, 12.043f, 0.0f, false, false, 5.0f, 1.0f)
                arcToRelative(4.393f, 4.393f, 0.0f, false, false, 3.0f, -1.0f)
                arcToRelative(10.32f, 10.32f, 0.0f, false, false, 4.0f, 1.0f)
                arcToRelative(10.328f, 10.328f, 0.0f, false, false, 4.0f, -1.0f)
                arcToRelative(10.091f, 10.091f, 0.0f, false, false, 3.0f, 1.0f)
                arcTo(12.043f, 12.043f, 0.0f, false, false, 20.4f, 0.765f)
                lineToRelative(0.414f, -0.083f)
                arcToRelative(2.709f, 2.709f, 0.0f, false, true, 3.12f, 3.284f)
                close()
                moveTo(9.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(9.0f, 10.0f)
                close()
                moveTo(17.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 18.0f)
                close()
                moveTo(2.0f, 14.0f)
                verticalLineToRelative(3.021f)
                arcTo(5.015f, 5.015f, 0.0f, false, true, 10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, true, 8.0f, -3.977f)
                lineTo(22.0f, 14.0f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
