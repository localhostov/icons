package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.WomanHead: ImageVector
    get() {
        if (_womanHead != null) {
            return _womanHead!!
        }
        _womanHead = Builder(name = "WomanHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.912f, 20.027f)
                lineToRelative(-1.057f, -5.96f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, false, -1.0f, -5.793f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.226f, 7.9f)
                lineTo(1.5f, 12.0f)
                reflectiveCurveToRelative(1.607f, 0.0f, 1.778f, -0.013f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 4.9f, -1.191f)
                arcTo(1.484f, 1.484f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.637f, -1.484f)
                arcTo(16.531f, 16.531f, 0.0f, false, false, 16.121f, 3.14f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 3.833f, 6.009f)
                lineToRelative(0.078f, 0.746f)
                lineToRelative(0.738f, 0.133f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                horizontalLineTo(19.351f)
                lineToRelative(-0.22f, 0.624f)
                curveTo(18.214f, 16.222f, 15.13f, 19.0f, 12.0f, 19.0f)
                arcToRelative(8.358f, 8.358f, 0.0f, false, true, -7.0f, -5.0f)
                horizontalLineTo(1.147f)
                lineTo(0.065f, 20.115f)
                arcTo(3.238f, 3.238f, 0.0f, false, false, 3.237f, 24.0f)
                lineTo(9.0f, 24.0f)
                verticalLineTo(20.408f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 12.0f, 21.0f)
                arcToRelative(8.218f, 8.218f, 0.0f, false, false, 3.0f, -0.591f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(5.762f)
                arcToRelative(3.217f, 3.217f, 0.0f, false, false, 2.56f, -1.256f)
                arcTo(3.172f, 3.172f, 0.0f, false, false, 23.912f, 20.027f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _womanHead!!
    }

private var _womanHead: ImageVector? = null
