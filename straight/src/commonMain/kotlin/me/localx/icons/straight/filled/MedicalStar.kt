package me.localx.icons.straight.filled

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

public val Icons.Filled.MedicalStar: ImageVector
    get() {
        if (_medicalStar != null) {
            return _medicalStar!!
        }
        _medicalStar = Builder(name = "MedicalStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.715f, 6.586f)
                lineToRelative(-1.045f, -1.705f)
                lineToRelative(-8.711f, 5.334f)
                lineToRelative(0.0f, -10.215f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 10.215f)
                lineToRelative(-8.711f, -5.334f)
                lineToRelative(-1.045f, 1.705f)
                lineToRelative(8.841f, 5.414f)
                lineToRelative(-8.841f, 5.414f)
                lineToRelative(1.045f, 1.705f)
                lineToRelative(8.711f, -5.334f)
                lineToRelative(0.0f, 10.215f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -10.215f)
                lineToRelative(8.711f, 5.334f)
                lineToRelative(1.045f, -1.705f)
                lineToRelative(-8.841f, -5.414f)
                lineToRelative(8.841f, -5.414f)
                close()
            }
        }
        .build()
        return _medicalStar!!
    }

private var _medicalStar: ImageVector? = null
