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

public val Icons.Outline.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 9.0f)
                curveToRelative(-2.2f, 0.0f, -4.264f, 0.596f, -6.039f, 1.634f)
                curveToRelative(-0.306f, -3.14f, -1.8f, -6.22f, -4.254f, -8.674f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.707f, 0.707f)
                curveToRelative(-2.454f, 2.454f, -3.949f, 5.535f, -4.254f, 8.674f)
                curveToRelative(-1.775f, -1.038f, -3.838f, -1.634f, -6.039f, -1.634f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 6.28f, 4.849f, 11.448f, 11.0f, 11.958f)
                lineToRelative(1.0f, 0.042f)
                lineToRelative(1.0f, -0.042f)
                curveToRelative(6.151f, -0.51f, 11.0f, -5.678f, 11.0f, -11.958f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 4.132f)
                curveToRelative(2.025f, 2.337f, 3.083f, 5.103f, 3.017f, 7.916f)
                curveToRelative(-1.283f, 1.145f, -2.319f, 2.562f, -3.017f, 4.158f)
                curveToRelative(-0.698f, -1.597f, -1.734f, -3.013f, -3.017f, -4.158f)
                curveToRelative(-0.065f, -2.813f, 0.992f, -5.579f, 3.017f, -7.916f)
                close()
                moveTo(2.055f, 11.055f)
                curveToRelative(4.673f, 0.493f, 8.397f, 4.217f, 8.89f, 8.89f)
                curveToRelative(-4.673f, -0.493f, -8.397f, -4.217f, -8.89f, -8.89f)
                close()
                moveTo(13.055f, 19.945f)
                curveToRelative(0.493f, -4.673f, 4.217f, -8.397f, 8.89f, -8.89f)
                curveToRelative(-0.493f, 4.673f, -4.217f, 8.397f, -8.89f, 8.89f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
