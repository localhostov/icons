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

public val Icons.Filled.ToiletPaperUnderSlash: ImageVector
    get() {
        if (_toiletPaperUnderSlash != null) {
            return _toiletPaperUnderSlash!!
        }
        _toiletPaperUnderSlash = Builder(name = "ToiletPaperUnderSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.351f)
                curveToRelative(0.002f, -0.706f, -0.457f, -1.302f, -1.113f, -1.564f)
                curveToRelative(-1.106f, -0.442f, -0.887f, -1.523f, -0.887f, -2.787f)
                verticalLineToRelative(-0.795f)
                curveToRelative(-0.504f, 0.734f, -1.107f, 1.279f, -1.815f, 1.566f)
                lineToRelative(-1.646f, -1.646f)
                curveToRelative(0.15f, 0.069f, 0.304f, 0.106f, 0.461f, 0.106f)
                curveToRelative(1.657f, 0.0f, 3.0f, -4.036f, 3.0f, -8.731f)
                reflectiveCurveTo(20.657f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(-3.0f, 3.806f, -3.0f, 8.5f)
                curveToRelative(0.0f, 3.237f, 0.638f, 6.16f, 1.578f, 7.664f)
                lineToRelative(-3.164f, -3.164f)
                curveToRelative(-0.279f, -1.413f, -0.414f, -2.958f, -0.414f, -4.5f)
                curveToRelative(0.0f, -3.238f, 0.595f, -6.491f, 1.868f, -8.5f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-0.924f, 0.0f, -1.782f, 0.381f, -2.517f, 1.069f)
                lineToRelative(-0.776f, -0.776f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.192f, -0.192f, 0.289f, -0.442f, 0.293f, -0.693f)
                curveToRelative(0.001f, -0.101f, 0.0f, -0.57f, 0.0f, -0.662f)
                close()
                moveTo(19.0f, 6.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(-0.448f, 2.0f, -1.0f, 2.0f)
                reflectiveCurveToRelative(-1.0f, -0.895f, -1.0f, -2.0f)
                reflectiveCurveToRelative(0.448f, -2.0f, 1.0f, -2.0f)
                close()
                moveTo(12.74f, 17.0f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-2.804f, 0.0f, -5.0f, -3.5f, -5.0f, -8.5f)
                curveToRelative(0.0f, -1.008f, 0.089f, -1.954f, 0.255f, -2.824f)
                curveToRelative(0.079f, -0.415f, 0.591f, -0.571f, 0.889f, -0.272f)
                lineToRelative(11.596f, 11.596f)
                close()
                moveTo(18.878f, 23.138f)
                curveToRelative(0.318f, 0.318f, 0.093f, 0.862f, -0.357f, 0.862f)
                horizontalLineToRelative(-7.52f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.74f)
                lineToRelative(4.138f, 4.138f)
                close()
            }
        }
        .build()
        return _toiletPaperUnderSlash!!
    }

private var _toiletPaperUnderSlash: ImageVector? = null
