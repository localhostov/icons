package me.localx.icons.straight.bold

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

public val Icons.Bold.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -3.209f, -3.488f)
                lineTo(16.25f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.379f, 2.0f)
                horizontalLineToRelative(-6.5f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 3.608f, 4.259f)
                lineTo(1.053f, 11.0f)
                arcTo(3.488f, 3.488f, 0.0f, false, false, 0.0f, 13.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(13.789f, 5.214f)
                lineTo(17.126f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.379f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.789f, 5.214f)
                close()
                moveTo(6.881f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.64f)
                lineTo(6.414f, 5.322f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.881f, 5.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
