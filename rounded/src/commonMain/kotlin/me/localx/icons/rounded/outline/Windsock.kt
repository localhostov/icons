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

public val Icons.Outline.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 5.829f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(3.014f, 3.014f, 0.0f, false, true, 4.86f, 5.352f)
                lineTo(21.588f, 8.7f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 24.0f, 11.64f)
                verticalLineToRelative(1.72f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 21.588f, 16.3f)
                lineTo(4.0f, 19.82f)
                lineTo(4.0f, 23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 24.0f)
                close()
                moveTo(4.0f, 7.22f)
                lineTo(4.0f, 17.78f)
                lineToRelative(2.0f, -0.4f)
                lineTo(6.0f, 7.62f)
                close()
                moveTo(8.0f, 8.02f)
                verticalLineToRelative(8.96f)
                lineToRelative(2.0f, -0.4f)
                lineTo(10.0f, 8.42f)
                close()
                moveTo(12.0f, 8.82f)
                verticalLineToRelative(7.36f)
                lineToRelative(2.0f, -0.4f)
                lineTo(14.0f, 9.22f)
                close()
                moveTo(16.0f, 9.62f)
                verticalLineToRelative(5.76f)
                lineToRelative(2.0f, -0.4f)
                lineTo(18.0f, 10.02f)
                close()
                moveTo(20.0f, 10.42f)
                verticalLineToRelative(4.162f)
                lineToRelative(1.2f, -0.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.981f)
                lineTo(22.0f, 11.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, -0.981f)
                close()
                moveTo(3.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 2.0f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
