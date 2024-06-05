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

public val Icons.Outline.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) {
            return _chargingStation!!
        }
        _chargingStation = Builder(name = "ChargingStation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.808f, 9.845f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.076f, 1.645f)
                lineTo(8.85f, 14.527f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.7f, -1.054f)
                lineTo(8.683f, 11.0f)
                horizontalLineTo(6.615f)
                arcTo(1.614f, 1.614f, 0.0f, false, true, 5.07f, 8.917f)
                curveTo(5.1f, 8.835f, 7.148f, 5.476f, 7.148f, 5.476f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.7f, 1.048f)
                lineTo(7.328f, 9.0f)
                horizontalLineTo(9.4f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 10.808f, 9.845f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineTo(5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineTo(17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(15.582f)
                arcTo(5.008f, 5.008f, 0.0f, false, true, 11.0f, 24.0f)
                horizontalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(7.95f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 5.5f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 3.0f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 19.0f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
