package me.localx.icons.rounded.filled

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

public val Icons.Filled.VenusDouble: ImageVector
    get() {
        if (_venusDouble != null) {
            return _venusDouble!!
        }
        _venusDouble = Builder(name = "VenusDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.849f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 10.124f, 0.478f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, false, 0.0f, 14.044f)
                arcTo(7.521f, 7.521f, 0.0f, false, true, 8.0f, 14.977f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 20.0f)
                close()
                moveTo(24.0f, 7.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, -8.0f, 7.475f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.849f)
                arcTo(7.513f, 7.513f, 0.0f, false, false, 24.0f, 7.5f)
                close()
            }
        }
        .build()
        return _venusDouble!!
    }

private var _venusDouble: ImageVector? = null
