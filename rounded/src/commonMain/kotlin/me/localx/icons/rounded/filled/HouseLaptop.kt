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

public val Icons.Filled.HouseLaptop: ImageVector
    get() {
        if (_houseLaptop != null) {
            return _houseLaptop!!
        }
        _houseLaptop = Builder(name = "HouseLaptop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 10.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.49f, 0.0f, 4.5f, 2.01f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -2.49f, 2.01f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-3.59f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-0.41f, 0.41f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-0.41f, -0.41f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-3.59f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.5f, 8.0f)
                horizontalLineToRelative(6.47f)
                curveToRelative(-0.13f, -1.24f, -0.72f, -2.39f, -1.67f, -3.22f)
                lineToRelative(-0.3f, -0.27f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.75f)
                lineToRelative(-1.92f, -1.69f)
                curveTo(10.27f, -0.36f, 7.73f, -0.36f, 5.92f, 1.06f)
                lineTo(1.92f, 4.19f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(5.87f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
