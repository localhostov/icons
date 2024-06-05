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

public val Icons.Outline.OliveOil: ImageVector
    get() {
        if (_oliveOil != null) {
            return _oliveOil!!
        }
        _oliveOil = Builder(name = "OliveOil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.462f)
                lineTo(15.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(9.0f, 8.0f)
                curveToRelative(0.0f, 0.661f, -1.212f, 1.68f, -2.281f, 2.579f)
                curveTo(4.976f, 12.044f, 3.0f, 13.7f, 3.0f, 16.0f)
                curveToRelative(0.0f, 2.6f, 1.453f, 3.939f, 2.991f, 5.356f)
                lineToRelative(0.5f, 0.468f)
                arcTo(1.616f, 1.616f, 0.0f, false, true, 7.0f, 23.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 23.0f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.5f, -1.177f)
                lineToRelative(0.5f, -0.467f)
                curveTo(19.547f, 19.939f, 21.0f, 18.6f, 21.0f, 16.0f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, false, -1.782f, -3.673f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(17.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.651f, 3.891f)
                lineToRelative(-0.37f, -0.312f)
                arcToRelative(9.038f, 9.038f, 0.0f, false, true, -2.2f, -2.259f)
                lineToRelative(0.035f, 0.013f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 17.0f, 7.0f)
                close()
                moveTo(16.653f, 19.886f)
                lineTo(16.136f, 20.365f)
                arcTo(3.618f, 3.618f, 0.0f, false, false, 15.141f, 22.0f)
                lineTo(8.859f, 22.0f)
                arcToRelative(3.609f, 3.609f, 0.0f, false, false, -1.0f, -1.634f)
                lineToRelative(-0.517f, -0.48f)
                curveTo(5.934f, 18.584f, 5.0f, 17.725f, 5.0f, 16.0f)
                arcToRelative(2.237f, 2.237f, 0.0f, false, true, 0.258f, -1.0f)
                lineTo(18.742f, 15.0f)
                arcTo(2.237f, 2.237f, 0.0f, false, true, 19.0f, 16.0f)
                curveTo(19.0f, 17.725f, 18.066f, 18.584f, 16.653f, 19.886f)
                close()
                moveTo(17.032f, 13.0f)
                lineTo(6.968f, 13.0f)
                curveToRelative(0.335f, -0.3f, 0.688f, -0.6f, 1.038f, -0.891f)
                curveTo(9.545f, 10.815f, 11.0f, 9.593f, 11.0f, 8.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.0f)
                curveToRelative(0.0f, 1.593f, 1.455f, 2.815f, 2.994f, 4.109f)
                curveToRelative(0.339f, 0.285f, 0.681f, 0.573f, 1.006f, 0.862f)
                lineTo(17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _oliveOil!!
    }

private var _oliveOil: ImageVector? = null
