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

public val Icons.Filled.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.194f, 69.944f)
                curveToRelative(-90.614f, -92.173f, -238.793f, -93.437f, -330.966f, -2.823f)
                reflectiveCurveToRelative(-93.437f, 238.793f, -2.823f, 330.966f)
                curveToRelative(1.126f, 1.146f, 2.264f, 2.28f, 3.414f, 3.402f)
                lineToRelative(83.892f, 77.509f)
                curveToRelative(44.849f, 43.874f, 116.481f, 44.054f, 161.549f, 0.404f)
                lineToRelative(84.934f, -78.487f)
                curveTo(513.586f, 309.518f, 513.586f, 161.34f, 422.194f, 69.944f)
                close()
                moveTo(341.813f, 256.705f)
                horizontalLineToRelative(-63.828f)
                verticalLineToRelative(63.828f)
                curveToRelative(0.0f, 11.75f, -9.526f, 21.276f, -21.276f, 21.276f)
                reflectiveCurveToRelative(-21.276f, -9.526f, -21.276f, -21.276f)
                verticalLineToRelative(-63.828f)
                horizontalLineToRelative(-63.828f)
                curveToRelative(-11.75f, 0.0f, -21.276f, -9.526f, -21.276f, -21.276f)
                reflectiveCurveToRelative(9.526f, -21.276f, 21.276f, -21.276f)
                horizontalLineToRelative(63.828f)
                verticalLineToRelative(-63.828f)
                curveToRelative(0.0f, -11.75f, 9.526f, -21.276f, 21.276f, -21.276f)
                reflectiveCurveToRelative(21.276f, 9.526f, 21.276f, 21.276f)
                verticalLineToRelative(63.828f)
                horizontalLineToRelative(63.828f)
                curveToRelative(11.75f, 0.0f, 21.276f, 9.526f, 21.276f, 21.276f)
                reflectiveCurveTo(353.563f, 256.705f, 341.813f, 256.705f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
