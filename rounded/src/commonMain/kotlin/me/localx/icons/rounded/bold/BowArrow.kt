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

public val Icons.Bold.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) {
            return _bowArrow!!
        }
        _bowArrow = Builder(name = "BowArrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.379f)
                lineTo(16.185f, 5.694f)
                arcTo(12.662f, 12.662f, 0.0f, false, false, 1.549f, 5.023f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 0.019f, 7.528f)
                arcToRelative(3.433f, 3.433f, 0.0f, false, false, 0.989f, 2.8f)
                lineTo(6.281f, 15.6f)
                lineTo(4.879f, 17.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.379f)
                lineToRelative(-0.44f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineTo(4.0f, 22.121f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(19.121f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(5.272f, 5.273f)
                arcTo(3.427f, 3.427f, 0.0f, false, false, 16.105f, 24.0f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, 0.367f, -0.019f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 2.5f, -1.53f)
                arcToRelative(12.664f, 12.664f, 0.0f, false, false, -0.671f, -14.636f)
                lineTo(21.0f, 5.121f)
                verticalLineTo(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 0.0f)
                close()
                moveTo(3.129f, 8.205f)
                arcTo(0.445f, 0.445f, 0.0f, false, true, 3.0f, 7.842f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.181f, -0.3f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 5.2f, -1.531f)
                arcToRelative(9.661f, 9.661f, 0.0f, false, true, 5.662f, 1.826f)
                lineTo(8.4f, 13.477f)
                close()
                moveTo(16.46f, 20.817f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.3f, 0.181f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, true, -0.363f, -0.127f)
                lineTo(10.523f, 15.6f)
                lineToRelative(5.642f, -5.642f)
                arcTo(9.648f, 9.648f, 0.0f, false, true, 16.46f, 20.817f)
                close()
            }
        }
        .build()
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
