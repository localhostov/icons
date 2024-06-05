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

public val Icons.Outline.GasPumpSlash: ImageVector
    get() {
        if (_gasPumpSlash != null) {
            return _gasPumpSlash!!
        }
        _gasPumpSlash = Builder(name = "GasPumpSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.843f, 20.249f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 24.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.9f, -2.249f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.938f, 0.5f)
                close()
                moveTo(24.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.826f, 2.76f)
                lineToRelative(1.533f, 1.533f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineToRelative(-22.0f, -22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.707f, 0.293f)
                lineToRelative(0.535f, 0.535f)
                arcTo(4.986f, 4.986f, 0.0f, false, true, 5.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(9.586f)
                lineTo(20.414f, 19.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(3.414f)
                lineTo(18.293f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.707f, 0.293f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(0.02f, 0.02f)
                lineToRelative(0.525f, 0.525f)
                arcTo(5.956f, 5.956f, 0.0f, false, true, 24.0f, 6.945f)
                curveTo(24.0f, 6.963f, 24.0f, 18.0f, 24.0f, 18.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineTo(12.414f)
                lineTo(14.0f, 12.586f)
                close()
                moveTo(3.707f, 2.293f)
                lineTo(10.414f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.707f, 2.293f)
                close()
            }
        }
        .build()
        return _gasPumpSlash!!
    }

private var _gasPumpSlash: ImageVector? = null
