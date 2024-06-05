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

public val Icons.Outline.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) {
            return _discoBall!!
        }
        _discoBall = Builder(name = "DiscoBall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.051f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(9.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 4.051f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(16.0f, 15.67f)
                lineTo(16.0f, 12.33f)
                curveToRelative(2.634f, 0.468f, 4.0f, 1.308f, 4.0f, 1.67f)
                reflectiveCurveTo(18.634f, 15.2f, 16.0f, 15.67f)
                close()
                moveTo(4.0f, 14.0f)
                curveToRelative(0.0f, -0.362f, 1.366f, -1.2f, 4.0f, -1.67f)
                verticalLineToRelative(3.34f)
                curveTo(5.366f, 15.2f, 4.0f, 14.362f, 4.0f, 14.0f)
                close()
                moveTo(10.0f, 12.078f)
                curveToRelative(0.621f, -0.049f, 1.285f, -0.078f, 2.0f, -0.078f)
                reflectiveCurveToRelative(1.379f, 0.029f, 2.0f, 0.078f)
                verticalLineToRelative(3.844f)
                curveToRelative(-0.621f, 0.049f, -1.285f, 0.078f, -2.0f, 0.078f)
                reflectiveCurveToRelative(-1.379f, -0.029f, -2.0f, -0.078f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, true, 2.0f, 0.263f)
                verticalLineToRelative(3.812f)
                curveToRelative(-0.664f, -0.049f, -1.335f, -0.075f, -2.0f, -0.075f)
                reflectiveCurveToRelative(-1.336f, 0.026f, -2.0f, 0.075f)
                lineTo(10.0f, 6.263f)
                arcTo(7.953f, 7.953f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(19.5f, 11.236f)
                arcTo(14.946f, 14.946f, 0.0f, false, false, 16.0f, 10.3f)
                lineTo(16.0f, 7.082f)
                arcTo(8.042f, 8.042f, 0.0f, false, true, 19.5f, 11.236f)
                close()
                moveTo(8.0f, 7.082f)
                lineTo(8.0f, 10.3f)
                arcToRelative(14.946f, 14.946f, 0.0f, false, false, -3.5f, 0.933f)
                arcTo(8.042f, 8.042f, 0.0f, false, true, 8.0f, 7.082f)
                close()
                moveTo(4.5f, 16.764f)
                arcTo(14.946f, 14.946f, 0.0f, false, false, 8.0f, 17.7f)
                verticalLineToRelative(3.221f)
                arcTo(8.042f, 8.042f, 0.0f, false, true, 4.5f, 16.764f)
                close()
                moveTo(10.0f, 21.737f)
                lineTo(10.0f, 17.925f)
                curveToRelative(0.664f, 0.049f, 1.335f, 0.075f, 2.0f, 0.075f)
                reflectiveCurveToRelative(1.336f, -0.026f, 2.0f, -0.075f)
                verticalLineToRelative(3.812f)
                arcToRelative(7.736f, 7.736f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(16.0f, 20.918f)
                lineTo(16.0f, 17.7f)
                arcToRelative(14.946f, 14.946f, 0.0f, false, false, 3.5f, -0.933f)
                arcTo(8.042f, 8.042f, 0.0f, false, true, 16.0f, 20.918f)
                close()
            }
        }
        .build()
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
