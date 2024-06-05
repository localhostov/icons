package me.localx.icons.straight.filled

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
                moveTo(16.85f, 5.48f)
                lineToRelative(-0.85f, -0.66f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 3.25f)
                lineTo(10.85f, 0.79f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0.0f)
                lineTo(1.15f, 5.48f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.43f, -1.15f, 2.36f)
                verticalLineToRelative(10.16f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0.0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(23.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.41f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
