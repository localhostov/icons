package me.localx.icons.rounded.bold

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

public val Icons.Bold.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.032f, 10.22f)
                curveToRelative(-0.761f, -1.102f, -1.032f, -1.869f, -1.032f, -2.22f)
                verticalLineToRelative(-2.435f)
                curveTo(21.0f, 2.746f, 18.897f, 0.396f, 16.109f, 0.099f)
                curveToRelative(-0.916f, -0.098f, -1.581f, -0.099f, -1.609f, -0.099f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.028f, 0.0f, -0.693f, 0.0f, -1.609f, 0.099f)
                curveTo(5.103f, 0.396f, 3.0f, 2.746f, 3.0f, 5.565f)
                verticalLineToRelative(2.435f)
                curveToRelative(0.0f, 0.351f, -0.271f, 1.118f, -1.032f, 2.219f)
                curveToRelative(-0.633f, 0.917f, -0.968f, 1.994f, -0.968f, 3.115f)
                verticalLineToRelative(5.166f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-5.166f)
                curveToRelative(0.0f, -1.121f, -0.335f, -2.198f, -0.968f, -3.114f)
                close()
                moveTo(12.0f, 7.787f)
                lineToRelative(-1.824f, -4.787f)
                horizontalLineToRelative(3.647f)
                lineToRelative(-1.824f, 4.787f)
                close()
                moveTo(4.0f, 18.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.666f)
                curveToRelative(0.0f, -0.509f, 0.15f, -0.996f, 0.437f, -1.409f)
                curveToRelative(1.037f, -1.502f, 1.563f, -2.822f, 1.563f, -3.925f)
                verticalLineToRelative(-2.435f)
                curveToRelative(0.0f, -0.882f, 0.45f, -1.663f, 1.141f, -2.108f)
                lineToRelative(3.359f, 8.817f)
                verticalLineToRelative(8.725f)
                lineTo(6.5f, 20.999f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                close()
                moveTo(17.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.5f, 12.275f)
                lineToRelative(3.359f, -8.817f)
                curveToRelative(0.691f, 0.445f, 1.141f, 1.225f, 1.141f, 2.108f)
                verticalLineToRelative(2.435f)
                curveToRelative(0.0f, 1.103f, 0.526f, 2.423f, 1.563f, 3.925f)
                curveToRelative(0.286f, 0.413f, 0.437f, 0.9f, 0.437f, 1.409f)
                verticalLineToRelative(1.666f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
