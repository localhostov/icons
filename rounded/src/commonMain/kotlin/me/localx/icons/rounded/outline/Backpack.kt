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

public val Icons.Outline.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(10.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 11.0f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 18.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 4.0f, -4.9f)
                lineTo(4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.015f, 5.073f)
                curveTo(8.013f, 5.048f, 8.0f, 5.026f, 8.0f, 5.0f)
                lineTo(8.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(16.0f, 5.0f)
                curveToRelative(0.0f, 0.026f, -0.013f, 0.048f, -0.015f, 0.073f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                verticalLineToRelative(1.1f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 24.0f, 18.0f)
                close()
                moveTo(10.0f, 4.263f)
                arcToRelative(7.736f, 7.736f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(6.0f, 16.535f)
                arcToRelative(8.368f, 8.368f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 12.0f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(0.026f)
                arcTo(4.948f, 4.948f, 0.0f, false, true, 4.0f, 19.0f)
                lineTo(4.0f, 15.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 22.0f)
                close()
                moveTo(15.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.874f, -2.188f)
                arcToRelative(6.432f, 6.432f, 0.0f, false, false, -11.748f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 22.0f)
                close()
                moveTo(22.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                lineTo(20.0f, 19.0f)
                arcToRelative(4.948f, 4.948f, 0.0f, false, true, -1.026f, 3.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
