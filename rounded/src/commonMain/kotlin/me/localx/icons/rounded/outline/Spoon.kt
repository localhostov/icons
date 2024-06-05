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

public val Icons.Outline.Spoon: ImageVector
    get() {
        if (_spoon != null) {
            return _spoon!!
        }
        _spoon = Builder(name = "Spoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.918f, 1.082f)
                curveToRelative(-2.58f, -2.58f, -8.743f, -0.04f, -11.1f, 2.316f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -0.635f, 8.0f)
                lineTo(0.294f, 22.292f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(12.6f, 12.816f)
                arcToRelative(6.179f, 6.179f, 0.0f, false, false, 8.0f, -0.635f)
                curveTo(22.958f, 9.824f, 25.5f, 3.662f, 22.918f, 1.082f)
                close()
                moveTo(19.188f, 10.767f)
                curveTo(15.16f, 14.59f, 9.411f, 8.84f, 13.233f, 4.812f)
                curveTo(14.91f, 3.28f, 19.283f, 0.956f, 21.5f, 2.5f)
                curveTo(22.951f, 3.943f, 21.039f, 8.915f, 19.188f, 10.767f)
                close()
            }
        }
        .build()
        return _spoon!!
    }

private var _spoon: ImageVector? = null
