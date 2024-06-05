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

public val Icons.Outline.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.207f, 21.293f)
                lineTo(0.732f, 13.818f)
                curveToRelative(-0.473f, -0.473f, -0.732f, -1.101f, -0.732f, -1.768f)
                reflectiveCurveToRelative(0.26f, -1.296f, 0.732f, -1.768f)
                lineTo(8.257f, 2.757f)
                lineToRelative(1.414f, 1.414f)
                lineTo(2.146f, 11.697f)
                curveToRelative(-0.127f, 0.127f, -0.146f, 0.276f, -0.146f, 0.354f)
                reflectiveCurveToRelative(0.019f, 0.227f, 0.147f, 0.354f)
                lineToRelative(7.474f, 7.475f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(23.268f, 13.818f)
                curveToRelative(0.472f, -0.473f, 0.732f, -1.101f, 0.732f, -1.768f)
                reflectiveCurveToRelative(-0.26f, -1.296f, -0.732f, -1.768f)
                lineTo(15.743f, 2.757f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(7.525f, 7.526f)
                curveToRelative(0.127f, 0.127f, 0.146f, 0.276f, 0.146f, 0.353f)
                reflectiveCurveToRelative(-0.019f, 0.227f, -0.146f, 0.354f)
                lineToRelative(-7.475f, 7.475f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.475f, -7.475f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
