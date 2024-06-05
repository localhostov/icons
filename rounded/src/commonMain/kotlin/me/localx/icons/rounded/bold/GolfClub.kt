package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

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
                horizontalLineTo(6.489f)
                arcToRelative(6.508f, 6.508f, 0.0f, false, true, -6.5f, -6.5f)
                verticalLineTo(15.537f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 7.76f, 9.162f)
                lineTo(19.2f, 11.441f)
                lineTo(20.8f, 1.262f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.963f, 0.471f)
                lineToRelative(-2.2f, 13.922f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, -0.679f, 2.554f)
                arcTo(9.7f, 9.7f, 0.0f, false, true, 12.016f, 24.0f)
                close()
                moveTo(6.485f, 12.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineTo(17.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(5.527f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 6.129f, -4.0f)
                arcTo(6.813f, 6.813f, 0.0f, false, false, 18.6f, 15.21f)
                lineToRelative(0.127f, -0.8f)
                lineTo(7.174f, 12.1f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 6.485f, 12.036f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.065f, 18.253f)
                arcToRelative(1.453f, 1.453f, 0.0f, false, true, -0.306f, -0.032f)
                lineToRelative(-6.317f, -1.31f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.61f, -2.938f)
                lineToRelative(6.316f, 1.311f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.3f, 2.969f)
                close()
            }
        }
        .build()
        return _golfClub!!
    }

private var _golfClub: ImageVector? = null
