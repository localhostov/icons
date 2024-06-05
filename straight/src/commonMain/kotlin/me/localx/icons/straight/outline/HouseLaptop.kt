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

public val Icons.Outline.HouseLaptop: ImageVector
    get() {
        if (_houseLaptop != null) {
            return _houseLaptop!!
        }
        _houseLaptop = Builder(name = "HouseLaptop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 7.84f)
                curveToRelative(0.0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(7.15f, 0.78f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0.0f)
                lineToRelative(3.15f, 2.47f)
                lineTo(14.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.82f)
                lineToRelative(0.85f, 0.66f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                verticalLineToRelative(0.16f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0.0f, -0.31f, -0.14f, -0.6f, -0.38f, -0.79f)
                lineTo(9.62f, 2.36f)
                curveToRelative(-0.36f, -0.29f, -0.87f, -0.28f, -1.23f, 0.0f)
                lineTo(2.38f, 7.06f)
                curveToRelative(-0.24f, 0.19f, -0.38f, 0.48f, -0.38f, 0.79f)
                verticalLineToRelative(8.16f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(9.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(3.41f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(10.0f, 12.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _houseLaptop!!
    }

private var _houseLaptop: ImageVector? = null
