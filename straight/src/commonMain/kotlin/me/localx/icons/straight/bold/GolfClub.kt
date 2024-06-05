package me.localx.icons.straight.bold

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

public val Icons.Bold.GolfClub: ImageVector
    get() {
        if (_golfClub != null) {
            return _golfClub!!
        }
        _golfClub = Builder(name = "GolfClub", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.016f, 24.0f)
                horizontalLineTo(4.987f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-5.3f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.963f, 8.8f)
                lineTo(19.2f, 11.441f)
                lineTo(21.019f, 0.015f)
                lineToRelative(2.962f, 0.47f)
                lineTo(21.57f, 15.655f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, -0.679f, 2.554f)
                arcTo(9.7f, 9.7f, 0.0f, false, true, 12.016f, 24.0f)
                close()
                moveTo(4.984f, 11.707f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 2.0f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(7.029f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 6.129f, -4.0f)
                arcTo(6.813f, 6.813f, 0.0f, false, false, 18.6f, 15.21f)
                lineToRelative(0.127f, -0.8f)
                lineTo(5.377f, 11.746f)
                arcTo(2.014f, 2.014f, 0.0f, false, false, 4.984f, 11.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1357f, 16.6298f)
                lineToRelative(0.6157f, -2.9361f)
                lineToRelative(8.5667f, 1.7964f)
                lineToRelative(-0.6157f, 2.9361f)
                close()
            }
        }
        .build()
        return _golfClub!!
    }

private var _golfClub: ImageVector? = null
