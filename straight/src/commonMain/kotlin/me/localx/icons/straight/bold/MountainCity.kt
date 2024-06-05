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

public val Icons.Bold.MountainCity: ImageVector
    get() {
        if (_mountainCity != null) {
            return _mountainCity!!
        }
        _mountainCity = Builder(name = "MountainCity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.962f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.762f)
                lineToRelative(-1.238f, -2.241f)
                verticalLineToRelative(-0.759f)
                close()
                moveTo(21.225f, 0.09f)
                curveToRelative(-0.011f, -0.003f, -0.022f, -0.008f, -0.033f, -0.01f)
                curveToRelative(-0.236f, -0.05f, -0.48f, -0.079f, -0.73f, -0.079f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.251f, 0.0f, -0.495f, 0.029f, -0.73f, 0.079f)
                curveToRelative(-0.011f, 0.003f, -0.022f, 0.008f, -0.033f, 0.01f)
                curveToRelative(-1.563f, 0.35f, -2.736f, 1.744f, -2.736f, 3.41f)
                verticalLineToRelative(3.35f)
                lineToRelative(2.127f, -3.85f)
                horizontalLineToRelative(12.373f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-1.962f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.962f)
                lineTo(23.963f, 3.5f)
                curveToRelative(0.0f, -1.667f, -1.174f, -3.06f, -2.736f, -3.41f)
                close()
                moveTo(13.961f, 5.0f)
                horizontalLineToRelative(-2.972f)
                lineToRelative(-0.016f, 1.732f)
                lineToRelative(0.701f, 1.268f)
                horizontalLineToRelative(2.287f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.499f, 6.392f)
                lineToRelative(8.5f, 15.381f)
                verticalLineToRelative(2.22f)
                lineTo(0.0f, 23.993f)
                verticalLineToRelative(-2.22f)
                lineTo(8.5f, 6.392f)
                close()
                moveTo(13.141f, 20.993f)
                lineToRelative(-2.511f, -4.544f)
                lineToRelative(-1.095f, 1.552f)
                lineToRelative(-1.018f, -1.6f)
                lineToRelative(-1.018f, 1.6f)
                lineToRelative(-1.115f, -1.58f)
                lineToRelative(-2.527f, 4.572f)
                horizontalLineToRelative(9.283f)
                close()
                moveTo(15.961f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.961f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _mountainCity!!
    }

private var _mountainCity: ImageVector? = null
