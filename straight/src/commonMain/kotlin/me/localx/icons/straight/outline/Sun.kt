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

public val Icons.Outline.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                lineTo(24.0f, 11.0f)
                lineTo(18.928f, 11.0f)
                arcToRelative(6.927f, 6.927f, 0.0f, false, false, -0.438f, -1.621f)
                lineToRelative(4.392f, -2.557f)
                lineTo(21.876f, 5.094f)
                lineTo(17.482f, 7.652f)
                arcToRelative(7.077f, 7.077f, 0.0f, false, false, -1.142f, -1.14f)
                lineToRelative(2.55f, -4.385f)
                lineTo(17.162f, 1.121f)
                lineToRelative(-2.55f, 4.385f)
                arcTo(6.91f, 6.91f, 0.0f, false, false, 13.0f, 5.072f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 5.072f)
                arcTo(6.908f, 6.908f, 0.0f, false, false, 9.4f, 5.5f)
                lineTo(6.854f, 1.121f)
                lineTo(5.126f, 2.127f)
                lineTo(7.671f, 6.5f)
                arcTo(7.046f, 7.046f, 0.0f, false, false, 6.524f, 7.646f)
                lineTo(2.14f, 5.094f)
                lineTo(1.134f, 6.822f)
                lineTo(5.513f, 9.371f)
                arcTo(6.9f, 6.9f, 0.0f, false, false, 5.072f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.072f, 13.0f)
                arcToRelative(6.948f, 6.948f, 0.0f, false, false, 0.438f, 1.622f)
                lineTo(1.141f, 17.165f)
                lineToRelative(1.006f, 1.729f)
                lineToRelative(4.372f, -2.546f)
                arcToRelative(7.028f, 7.028f, 0.0f, false, false, 1.13f, 1.131f)
                lineTo(5.1f, 21.865f)
                lineToRelative(1.729f, 1.006f)
                lineToRelative(2.548f, -4.382f)
                arcTo(6.912f, 6.912f, 0.0f, false, false, 11.0f, 18.928f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 18.928f)
                arcToRelative(6.918f, 6.918f, 0.0f, false, false, 1.638f, -0.445f)
                lineToRelative(2.552f, 4.388f)
                lineToRelative(1.728f, -1.006f)
                lineTo(16.362f, 17.47f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, false, 1.125f, -1.128f)
                lineToRelative(4.383f, 2.552f)
                lineToRelative(1.0f, -1.729f)
                lineToRelative(-4.382f, -2.551f)
                arcTo(6.928f, 6.928f, 0.0f, false, false, 18.928f, 13.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(-0.21f, 6.608f, -9.791f, 6.606f, -10.0f, 0.0f)
                curveTo(7.21f, 5.392f, 16.791f, 5.394f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
