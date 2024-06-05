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

public val Icons.Bold.MedicalStar: ImageVector
    get() {
        if (_medicalStar != null) {
            return _medicalStar!!
        }
        _medicalStar = Builder(name = "MedicalStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.831f, 12.0f)
                lineToRelative(8.144f, 4.987f)
                lineToRelative(-1.566f, 2.559f)
                lineToRelative(-7.95f, -4.868f)
                verticalLineToRelative(9.323f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.323f)
                lineToRelative(-7.95f, 4.868f)
                lineToRelative(-1.566f, -2.559f)
                lineToRelative(8.144f, -4.987f)
                lineTo(0.942f, 7.013f)
                lineToRelative(1.566f, -2.559f)
                lineToRelative(7.95f, 4.868f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.323f)
                lineToRelative(7.95f, -4.868f)
                lineToRelative(1.566f, 2.559f)
                lineToRelative(-8.144f, 4.987f)
                close()
            }
        }
        .build()
        return _medicalStar!!
    }

private var _medicalStar: ImageVector? = null
