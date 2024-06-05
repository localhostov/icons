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

public val Icons.Outline.Scarecrow: ImageVector
    get() {
        if (_scarecrow != null) {
            return _scarecrow!!
        }
        _scarecrow = Builder(name = "Scarecrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                horizontalLineToRelative(-8.061f)
                curveToRelative(0.666f, -0.89f, 1.061f, -2.011f, 1.061f, -3.227f)
                verticalLineToRelative(-0.773f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.005f)
                curveToRelative(-0.074f, -1.115f, -1.004f, -2.0f, -2.137f, -2.0f)
                horizontalLineToRelative(-5.715f)
                curveToRelative(-1.134f, 0.0f, -2.064f, 0.885f, -2.137f, 2.0f)
                horizontalLineToRelative(-2.005f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.084f, 0.358f, 2.14f, 1.001f, 3.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(0.773f)
                curveToRelative(0.0f, 1.694f, -1.272f, 3.14f, -2.838f, 3.222f)
                curveToRelative(-0.842f, 0.047f, -1.625f, -0.247f, -2.227f, -0.818f)
                curveToRelative(-0.604f, -0.572f, -0.936f, -1.346f, -0.936f, -2.177f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _scarecrow!!
    }

private var _scarecrow: ImageVector? = null
