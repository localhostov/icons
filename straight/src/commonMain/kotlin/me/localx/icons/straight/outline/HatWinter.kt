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

public val Icons.Outline.HatWinter: ImageVector
    get() {
        if (_hatWinter != null) {
            return _hatWinter!!
        }
        _hatWinter = Builder(name = "HatWinter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.907f, 17.296f)
                curveToRelative(-0.555f, -5.277f, -3.563f, -11.683f, -8.131f, -13.037f)
                curveToRelative(0.447f, -0.452f, 0.724f, -1.073f, 0.724f, -1.759f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.686f, 0.276f, 1.307f, 0.724f, 1.759f)
                curveToRelative(-4.568f, 1.354f, -7.576f, 7.76f, -8.131f, 13.037f)
                curveToRelative(-1.231f, 0.543f, -2.093f, 1.775f, -2.093f, 3.204f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.429f, -0.862f, -2.661f, -2.093f, -3.204f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(3.827f, 0.0f, 7.167f, 5.639f, 7.866f, 11.0f)
                lineTo(4.134f, 17.0f)
                curveToRelative(0.087f, -0.666f, 0.214f, -1.337f, 0.379f, -2.0f)
                horizontalLineToRelative(12.913f)
                curveToRelative(-0.191f, -0.69f, -0.425f, -1.362f, -0.692f, -2.0f)
                lineTo(5.127f, 13.0f)
                curveToRelative(1.415f, -3.839f, 4.008f, -7.0f, 6.873f, -7.0f)
                close()
                moveTo(20.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hatWinter!!
    }

private var _hatWinter: ImageVector? = null
