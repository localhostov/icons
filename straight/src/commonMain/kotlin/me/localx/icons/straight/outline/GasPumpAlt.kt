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

public val Icons.Outline.GasPumpAlt: ImageVector
    get() {
        if (_gasPumpAlt != null) {
            return _gasPumpAlt!!
        }
        _gasPumpAlt = Builder(name = "GasPumpAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 4.0f)
                lineTo(19.707f, 0.293f)
                lineTo(18.293f, 1.707f)
                lineTo(20.0f, 3.414f)
                verticalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineTo(5.414f)
                arcTo(2.011f, 2.011f, 0.0f, false, false, 23.414f, 4.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _gasPumpAlt!!
    }

private var _gasPumpAlt: ImageVector? = null