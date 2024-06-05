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

public val Icons.Filled.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.778f, 14.6f)
                arcTo(1.984f, 1.984f, 0.0f, false, false, 24.0f, 15.013f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, true, -2.445f, -0.834f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -1.111f, 0.0f)
                arcTo(3.96f, 3.96f, 0.0f, false, true, 0.0f, 17.013f)
                verticalLineToRelative(-2.0f)
                arcTo(1.979f, 1.979f, 0.0f, false, false, 1.221f, 14.6f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.948f, 2.948f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.033f, 2.033f, 0.0f, false, false, 2.443f, 0.0f)
                arcTo(2.948f, 2.948f, 0.0f, false, true, 22.778f, 14.6f)
                close()
                moveTo(0.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(0.0f)
                close()
                moveTo(18.724f, 1.05f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -3.481f, -0.8f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
