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

public val Icons.Outline.GlassChampagne: ImageVector
    get() {
        if (_glassChampagne != null) {
            return _glassChampagne!!
        }
        _glassChampagne = Builder(name = "GlassChampagne", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.091f)
                curveToRelative(3.388f, -0.487f, 6.0f, -3.416f, 5.996f, -7.019f)
                lineToRelative(-0.834f, -9.162f)
                curveToRelative(-0.142f, -1.555f, -1.426f, -2.728f, -2.988f, -2.728f)
                horizontalLineToRelative(-6.348f)
                curveToRelative(-1.562f, 0.0f, -2.846f, 1.173f, -2.988f, 2.728f)
                lineToRelative(-0.838f, 9.253f)
                curveToRelative(0.0f, 3.52f, 2.612f, 6.442f, 6.0f, 6.928f)
                verticalLineToRelative(3.091f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(8.826f, 2.0f)
                horizontalLineToRelative(6.348f)
                curveToRelative(0.521f, 0.0f, 0.949f, 0.391f, 0.996f, 0.91f)
                lineToRelative(0.191f, 2.09f)
                lineTo(7.64f, 5.0f)
                lineToRelative(0.19f, -2.09f)
                curveToRelative(0.047f, -0.519f, 0.475f, -0.91f, 0.996f, -0.91f)
                close()
                moveTo(6.996f, 12.072f)
                lineToRelative(0.462f, -5.072f)
                horizontalLineToRelative(9.086f)
                lineToRelative(0.456f, 4.981f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.004f, -4.909f)
                close()
            }
        }
        .build()
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
