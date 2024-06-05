package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 149.333f)
                curveToRelative(-27.809f, 1.381f, -49.268f, 24.986f, -48.0f, 52.8f)
                curveToRelative(1.268f, -27.814f, -20.191f, -51.419f, -48.0f, -52.8f)
                curveToRelative(-27.809f, 1.381f, -49.268f, 24.986f, -48.0f, 52.8f)
                curveToRelative(0.0f, 41.536f, 54.144f, 90.987f, 81.067f, 112.64f)
                curveToRelative(8.718f, 7.021f, 21.149f, 7.021f, 29.867f, 0.0f)
                curveTo(265.899f, 293.12f, 320.0f, 243.669f, 320.0f, 202.133f)
                curveTo(321.268f, 174.319f, 299.809f, 150.714f, 272.0f, 149.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.661f, 457.373f)
                lineToRelative(-99.046f, -99.067f)
                curveToRelative(74.109f, -99.025f, 53.911f, -239.377f, -45.113f, -313.487f)
                reflectiveCurveTo(119.125f, -9.092f, 45.016f, 89.933f)
                reflectiveCurveTo(-8.896f, 329.31f, 90.129f, 403.419f)
                curveToRelative(79.552f, 59.536f, 188.821f, 59.536f, 268.373f, 0.0f)
                lineToRelative(99.067f, 99.088f)
                curveToRelative(12.452f, 12.452f, 32.64f, 12.452f, 45.092f, 0.0f)
                curveToRelative(12.452f, -12.452f, 12.452f, -32.64f, 0.0f, -45.092f)
                verticalLineTo(457.373f)
                close()
                moveTo(65.743f, 224.921f)
                curveToRelative(0.0f, -88.02f, 71.354f, -159.374f, 159.374f, -159.374f)
                reflectiveCurveToRelative(159.374f, 71.354f, 159.374f, 159.374f)
                reflectiveCurveToRelative(-71.354f, 159.374f, -159.374f, 159.374f)
                curveTo(137.136f, 384.201f, 65.837f, 312.901f, 65.743f, 224.921f)
                close()
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
