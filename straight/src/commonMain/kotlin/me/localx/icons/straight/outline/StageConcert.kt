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

public val Icons.Outline.StageConcert: ImageVector
    get() {
        if (_stageConcert != null) {
            return _stageConcert!!
        }
        _stageConcert = Builder(name = "StageConcert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.277f, 4.556f)
                lineTo(13.372f, 0.302f)
                curveToRelative(-0.847f, -0.404f, -1.819f, -0.404f, -2.668f, 0.0f)
                lineTo(1.799f, 4.556f)
                curveTo(0.73f, 5.066f, 0.039f, 6.163f, 0.039f, 7.349f)
                verticalLineToRelative(16.651f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.039f, 7.349f)
                curveToRelative(0.0f, -1.187f, -0.691f, -2.282f, -1.761f, -2.793f)
                close()
                moveTo(11.566f, 2.107f)
                curveToRelative(0.3f, -0.143f, 0.645f, -0.143f, 0.944f, 0.0f)
                lineToRelative(6.057f, 2.894f)
                lineTo(5.509f, 5.001f)
                lineToRelative(6.057f, -2.894f)
                close()
                moveTo(13.0f, 18.001f)
                verticalLineToRelative(-4.52f)
                lineToRelative(2.125f, -1.699f)
                lineToRelative(-1.249f, -1.562f)
                lineToRelative(-2.875f, 2.301f)
                verticalLineToRelative(5.48f)
                lineTo(2.039f, 18.001f)
                lineTo(2.039f, 7.349f)
                curveToRelative(0.0f, -0.121f, 0.025f, -0.237f, 0.063f, -0.349f)
                horizontalLineToRelative(2.898f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.975f)
                curveToRelative(0.038f, 0.112f, 0.063f, 0.228f, 0.063f, 0.349f)
                verticalLineToRelative(10.651f)
                horizontalLineToRelative(-9.039f)
                close()
                moveTo(17.61f, 22.001f)
                lineToRelative(0.805f, 2.0f)
                lineTo(5.584f, 24.001f)
                lineToRelative(0.805f, -2.0f)
                horizontalLineToRelative(11.221f)
                close()
            }
        }
        .build()
        return _stageConcert!!
    }

private var _stageConcert: ImageVector? = null
