package me.localx.icons.straight.bold

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

public val Icons.Bold.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.086f)
                curveToRelative(0.0f, -1.091f, -0.425f, -2.117f, -1.197f, -2.889f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.594f, -1.593f, -4.187f, -1.592f, -5.776f, -0.002f)
                lineTo(7.497f, 10.686f)
                lineToRelative(-4.753f, 1.056f)
                lineTo(0.024f, 23.976f)
                lineToRelative(12.255f, -2.723f)
                lineToRelative(0.948f, -4.74f)
                lineToRelative(9.576f, -9.537f)
                curveToRelative(0.772f, -0.771f, 1.197f, -1.798f, 1.197f, -2.89f)
                close()
                moveTo(5.831f, 19.612f)
                lineToRelative(2.466f, -2.466f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.512f, 2.511f)
                lineToRelative(0.886f, -3.987f)
                lineToRelative(3.961f, -0.48f)
                lineToRelative(1.248f, 1.248f)
                lineToRelative(-0.745f, 3.723f)
                lineToRelative(-3.89f, 0.864f)
                close()
                moveTo(20.683f, 4.852f)
                lineToRelative(-8.091f, 8.058f)
                lineToRelative(-1.536f, -1.536f)
                lineTo(19.146f, 3.318f)
                curveToRelative(0.423f, -0.422f, 1.111f, -0.424f, 1.536f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.205f, 0.206f, 0.318f, 0.479f, 0.318f, 0.768f)
                reflectiveCurveToRelative(-0.112f, 0.562f, -0.316f, 0.766f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
