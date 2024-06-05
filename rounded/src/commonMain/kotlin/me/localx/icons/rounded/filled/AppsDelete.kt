package me.localx.icons.rounded.filled

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

public val Icons.Filled.AppsDelete: ImageVector
    get() {
        if (_appsDelete != null) {
            return _appsDelete!!
        }
        _appsDelete = Builder(name = "AppsDelete", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.333f, 0.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 47.128f, -38.205f, 85.333f, -85.333f, 85.333f)
                horizontalLineToRelative(-64.0f)
                curveTo(38.205f, 234.667f, 0.0f, 196.462f, 0.0f, 149.333f)
                verticalLineToRelative(-64.0f)
                curveTo(0.0f, 38.205f, 38.205f, 0.0f, 85.333f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.333f, 277.333f)
                horizontalLineToRelative(64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 47.128f, -38.205f, 85.333f, -85.333f, 85.333f)
                horizontalLineToRelative(-64.0f)
                curveTo(38.205f, 512.0f, 0.0f, 473.795f, 0.0f, 426.667f)
                verticalLineToRelative(-64.0f)
                curveTo(0.0f, 315.538f, 38.205f, 277.333f, 85.333f, 277.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.667f, 277.333f)
                horizontalLineToRelative(64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(64.0f)
                curveTo(512.0f, 473.795f, 473.795f, 512.0f, 426.667f, 512.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-47.128f, 0.0f, -85.333f, -38.205f, -85.333f, -85.333f)
                verticalLineToRelative(-64.0f)
                curveTo(277.333f, 315.538f, 315.538f, 277.333f, 362.667f, 277.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.667f, 149.333f)
                horizontalLineToRelative(170.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveToRelative(-9.551f, -21.333f, -21.333f, -21.333f)
                horizontalLineTo(298.667f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveTo(286.885f, 149.333f, 298.667f, 149.333f)
                close()
            }
        }
        .build()
        return _appsDelete!!
    }

private var _appsDelete: ImageVector? = null
