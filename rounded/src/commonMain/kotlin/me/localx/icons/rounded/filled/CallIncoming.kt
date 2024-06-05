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

public val Icons.Filled.CallIncoming: ImageVector
    get() {
        if (_callIncoming != null) {
            return _callIncoming!!
        }
        _callIncoming = Builder(name = "CallIncoming", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(17.0f, 5.613f)
                curveTo(17.63f, 4.981f, 21.7f, 0.887f, 22.293f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                curveTo(23.115f, 2.3f, 19.064f, 6.373f, 18.439f, 7.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(17.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 7.0f)
                close()
                moveTo(20.655f, 14.855f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                arcTo(12.784f, 12.784f, 0.0f, false, true, 7.537f, 9.524f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.109f, 3.109f, 0.0f, false, false, 0.006f, -4.282f)
                reflectiveCurveTo(7.291f, 0.939f, 7.26f, 0.908f)
                arcTo(3.082f, 3.082f, 0.0f, false, false, 2.934f, 0.862f)
                lineToRelative(-1.15f, 1.0f)
                curveToRelative(-7.719f, 8.21f, 12.2f, 28.138f, 20.4f, 20.3f)
                lineToRelative(0.912f, -1.05f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.377f)
                curveTo(23.063f, 16.708f, 20.655f, 14.856f, 20.655f, 14.856f)
                close()
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
