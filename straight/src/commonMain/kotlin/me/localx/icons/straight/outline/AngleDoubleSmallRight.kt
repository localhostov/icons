package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.AngleDoubleSmallRight: ImageVector
    get() {
        if (_angleDoubleSmallRight != null) {
            return _angleDoubleSmallRight!!
        }
        _angleDoubleSmallRight = Builder(name = "AngleDoubleSmallRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0996f, 10.586f)
                lineTo(13.8106f, 5.293f)
                lineTo(12.3996f, 6.707f)
                lineTo(17.6886f, 12.0f)
                lineTo(12.3996f, 17.293f)
                lineTo(13.8146f, 18.707f)
                lineTo(19.0996f, 13.414f)
                curveTo(19.4745f, 13.0389f, 19.6852f, 12.5303f, 19.6852f, 12.0f)
                curveTo(19.6852f, 11.4696f, 19.4745f, 10.961f, 19.0996f, 10.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8108f, 11.293f)
                lineTo(6.8108f, 5.293f)
                lineTo(5.3998f, 6.707f)
                lineTo(10.6888f, 12.0f)
                lineTo(5.3998f, 17.293f)
                lineTo(6.8148f, 18.707f)
                lineTo(12.8148f, 12.707f)
                curveTo(13.0017f, 12.5189f, 13.1063f, 12.2643f, 13.1056f, 11.9991f)
                curveTo(13.1048f, 11.734f, 12.9988f, 11.48f, 12.8108f, 11.293f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallRight!!
    }

private var _angleDoubleSmallRight: ImageVector? = null
