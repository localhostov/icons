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

public val Icons.Bold.GasPumpAlt: ImageVector
    get() {
        if (_gasPumpAlt != null) {
            return _gasPumpAlt!!
        }
        _gasPumpAlt = Builder(name = "GasPumpAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.435f)
                arcToRelative(6.454f, 6.454f, 0.0f, false, false, -1.9f, -4.46f)
                lineTo(19.561f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineTo(19.0f, 4.121f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineTo(18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.5f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 10.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 16.0f, 18.5f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                reflectiveCurveTo(24.0f, 7.457f, 24.0f, 7.435f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 5.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                close()
                moveTo(13.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _gasPumpAlt!!
    }

private var _gasPumpAlt: ImageVector? = null
