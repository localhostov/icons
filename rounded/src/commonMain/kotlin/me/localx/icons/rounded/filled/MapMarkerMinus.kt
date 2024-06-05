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

public val Icons.Filled.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.147f, 69.996f)
                curveToRelative(-90.589f, -92.147f, -238.726f, -93.411f, -330.873f, -2.822f)
                reflectiveCurveTo(-2.137f, 305.9f, 88.452f, 398.047f)
                curveToRelative(1.126f, 1.145f, 2.264f, 2.279f, 3.413f, 3.401f)
                lineToRelative(83.868f, 77.487f)
                curveToRelative(44.837f, 43.862f, 116.448f, 44.041f, 161.504f, 0.404f)
                lineToRelative(84.91f, -78.465f)
                curveTo(513.513f, 309.503f, 513.513f, 161.367f, 422.147f, 69.996f)
                close()
                moveTo(341.789f, 256.705f)
                horizontalLineTo(171.628f)
                curveToRelative(-11.747f, 0.0f, -21.27f, -9.523f, -21.27f, -21.27f)
                reflectiveCurveToRelative(9.523f, -21.27f, 21.27f, -21.27f)
                horizontalLineToRelative(170.161f)
                curveToRelative(11.747f, 0.0f, 21.27f, 9.523f, 21.27f, 21.27f)
                reflectiveCurveTo(353.536f, 256.705f, 341.789f, 256.705f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
